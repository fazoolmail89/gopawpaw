package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DalMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DalMstr
 * @author MyEclipse Persistence Tools
 */

public class DalMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DalMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DalMstr transientInstance) {
		log.debug("saving DalMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DalMstr persistentInstance) {
		log.debug("deleting DalMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DalMstr findById(com.gopawpaw.erp.hibernate.d.DalMstrId id) {
		log.debug("getting DalMstr instance with id: " + id);
		try {
			DalMstr instance = (DalMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DalMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DalMstr instance) {
		log.debug("finding DalMstr instance by example");
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
		log.debug("finding DalMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DalMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DalMstr instances");
		try {
			String queryString = "from DalMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DalMstr merge(DalMstr detachedInstance) {
		log.debug("merging DalMstr instance");
		try {
			DalMstr result = (DalMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DalMstr instance) {
		log.debug("attaching dirty DalMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DalMstr instance) {
		log.debug("attaching clean DalMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DalMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DalMstrDAO) ctx.getBean("DalMstrDAO");
	}
}