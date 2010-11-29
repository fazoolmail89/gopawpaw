package com.gopawpaw.erp.hibernate.e;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EuMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.e.EuMstr
 * @author MyEclipse Persistence Tools
 */

public class EuMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(EuMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(EuMstr transientInstance) {
		log.debug("saving EuMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EuMstr persistentInstance) {
		log.debug("deleting EuMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EuMstr findById(com.gopawpaw.erp.hibernate.e.EuMstrId id) {
		log.debug("getting EuMstr instance with id: " + id);
		try {
			EuMstr instance = (EuMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.e.EuMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EuMstr instance) {
		log.debug("finding EuMstr instance by example");
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
		log.debug("finding EuMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EuMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all EuMstr instances");
		try {
			String queryString = "from EuMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EuMstr merge(EuMstr detachedInstance) {
		log.debug("merging EuMstr instance");
		try {
			EuMstr result = (EuMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EuMstr instance) {
		log.debug("attaching dirty EuMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EuMstr instance) {
		log.debug("attaching clean EuMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EuMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EuMstrDAO) ctx.getBean("EuMstrDAO");
	}
}