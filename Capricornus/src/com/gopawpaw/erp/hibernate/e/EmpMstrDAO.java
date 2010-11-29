package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmpMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EmpMstr
 * @author MyEclipse Persistence Tools
 */

public class EmpMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EmpMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EmpMstr transientInstance) {
		log.debug("saving EmpMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmpMstr persistentInstance) {
		log.debug("deleting EmpMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmpMstr findById(com.gopawpaw.erp.hibernate.e.EmpMstrId id) {
		log.debug("getting EmpMstr instance with id: " + id);
		try {
			EmpMstr instance = (EmpMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EmpMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmpMstr instance) {
		log.debug("finding EmpMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EmpMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmpMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EmpMstr instances");
		try {
			String queryString = "from EmpMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmpMstr merge(EmpMstr detachedInstance) {
		log.debug("merging EmpMstr instance");
		try {
			EmpMstr result = (EmpMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmpMstr instance) {
		log.debug("attaching dirty EmpMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmpMstr instance) {
		log.debug("attaching clean EmpMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmpMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmpMstrDAO) ctx.getBean("EmpMstrDAO");
	}
}