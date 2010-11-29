package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VexMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VexMstr
 * @author MyEclipse Persistence Tools
 */

public class VexMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VexMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VexMstr transientInstance) {
		log.debug("saving VexMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VexMstr persistentInstance) {
		log.debug("deleting VexMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VexMstr findById(com.gopawpaw.erp.hibernate.v.VexMstrId id) {
		log.debug("getting VexMstr instance with id: " + id);
		try {
			VexMstr instance = (VexMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VexMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VexMstr instance) {
		log.debug("finding VexMstr instance by example");
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
		log.debug("finding VexMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VexMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VexMstr instances");
		try {
			String queryString = "from VexMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VexMstr merge(VexMstr detachedInstance) {
		log.debug("merging VexMstr instance");
		try {
			VexMstr result = (VexMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VexMstr instance) {
		log.debug("attaching dirty VexMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VexMstr instance) {
		log.debug("attaching clean VexMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VexMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VexMstrDAO) ctx.getBean("VexMstrDAO");
	}
}